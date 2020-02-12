package com.neuedu.test;


import java.io.*;
import java.util.ArrayList;

/**
 * Created by hy on 2020/2/12.
 */
public class LiuTest {
    public static void main(String[] args) {
        /*int a = 10;
        Student student = new Student();
        student.getId(10);
        student.setName("Sherry");
        student.setAge(18);
        student.setGrade("卓越一班");*/

        //路径的写法 盘符：/文件夹/文件
        //	路径之间用 /分隔或者\\
        //	File对象只能提供文件的信息描述(属性) 并不能对文件进行任何的读写操作
        /*File file =new File("d:/2020mi/0212/MyBookMain/a/b/c/abcd.java");*/
        //获取文件的文件名
        /*System.out.println(file.getName());
        //获取文件大小(字节)
        System.out.println(file.length());
        //查看文件是否存在 true/false
        System.out.println(file.exists());
        //获取文件路径
        System.out.println(file.getPath());
        //mkdir() 创建目录 只创建目录的最后一级 必须保证前面的父目录都存在
        //mkdirs() 创建目录 创建目录无论是任何一级 不存在就会创建
        System.out.println(file.mkdirs());
        //创建文件 返回boolean
        //如果文件不存在 则可以创建 如果已经存在不会再创建
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //isDirector() 是否是目录
        System.out.println(file.isDirectory());
        //isFile() 是否是文件
        System.out.println(file.isFile());
        //deleta() 删除文件 删除成功返回true
        System.out.println(file.delete());*/

        //代表把file对象输出到哪去
        /*try {
            OutputStream outputStream = new FileOutputStream(file,true);
            //
            String b = "\n19980000";
            outputStream.write(b.getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        /*InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            byte[] c = new byte[8];
            int d = inputStream.read(c);
            while (d!=-1){
                System.out.println("读取字节数："+d);
                new String(c,0,d);
                System.out.println(new String(c,0,d));
                d = inputStream.read(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (inputStream != null){
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        /*Reader reader = null;
        BufferedReader br =null;
        try {
            reader =new FileReader(file);
            br = new BufferedReader(reader);
            String str = br.readLine();
            while (str!=null){
                System.out.println(str);
                str = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if(br!=null){
                    br.close();
                }
                if (reader!=null) {
                    reader.close();
                }
            } catch (IOException e) {
                    e.printStackTrace();

            }
        }*/
        /*Writer writer =null;
        try {
            writer = new FileWriter(file,true);
            writer.write("\n000019950000");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(writer!=null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        /*
        *
        * 把d盘下的某个文件复制到d：\\a下
        *
        * */
        /*File from =new File("d:/msyh.ttf");
        File parent = new File("d:/a");
        if (!parent.exists()){
            parent.mkdirs();
        }
        File to = new File("d:/a/"+from.getName());
        InputStream inputStream =null;
        OutputStream outputStream =null;
        byte[] b = new byte[1024];
        try {
            inputStream =new FileInputStream(from);
            //往OutputStream里边写东西
            outputStream = new FileOutputStream(to);
            int len = inputStream.read(b);
            while (len!=-1){
                outputStream.write(b,0,len);
                outputStream.flush();
                len = inputStream.read(b);
            }
            System.out.println("复制完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (outputStream!=null)
                    outputStream.close();
                if (inputStream!=null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        /*
        * 怎么将一个java对象保存到硬盘中
        * 	首先要有这个的对象
        *   是输出流 OutPutStream ObjectOutputStream
        *
        *
        * */
        /*Student student = new Student();
        student.getId(10);
        student.setName("Sherry");
        student.setAge(18);
        student.setGrade("卓越一班");
        File file = new File("d:/student");
        OutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            outputStream =new FileOutputStream(file);
            objectOutputStream =new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(student);
            objectOutputStream.flush();
            outputStream.flush();
            System.out.println("保存完成");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (objectOutputStream!=null)
                    objectOutputStream.close();
                if (outputStream!=null)
                    outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        File file = new File("d:/student");
        InputStream inputStream = null;
        ObjectInputStream objectInputStream =null;
        try {
            inputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(inputStream);
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (objectInputStream!=null)
                    objectInputStream.close();
                if (inputStream!=null)
                    inputStream.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
