package com.stringTutorial;

public class StringMainTestClass {
   public static void main(String args[]) {
	   
	   System.out.println("===============String Leteral=============================");
	   String name1="Kamlesh";//String Pool
	   String name2="Kamlesh";//First check if string is present in String pool then refer to reference
	   System.out.println(name1.hashCode());
	   System.out.println(name2.hashCode());
	   
	   System.out.println(name1==name2);//true
	   
	   System.out.println(name1.equals(name2));//true
	   
	   System.out.println("==================String Leteral and new Key==========================");
	   
	   String name3=new String("Kamlesh");// Create New String New Location so crete New Reference value
	  // System.out.println(name1.hashCode());
	   System.out.println(name3.hashCode());
	   
	   System.out.println(name1==name3);//check Reference//false
	   
	   System.out.println(name1.equals(name3));//check contains//true
	   System.out.println("==================String new Key==========================");
	   String name4=new String("Kamlesh");// Create New String New Location so crete New Reference value
	   String name5=new String("Kamlesh");// Create New String New Location so crete New Reference value
	   
	   System.out.println(name4.hashCode());
	   System.out.println(name5.hashCode());
	   
	   System.out.println(name4==name5);//check Reference//false
	   System.out.println(name4.equals(name5));//check contains//true
	   
	   System.out.println("==================String  Buffer and Latetral==========================");
	   StringBuffer bufer1= new StringBuffer("Kamlesh");
	   
	   //System.out.println(bufer1==name1));//comment because String buffer and String can't use == operator compile time error
	   System.out.println(bufer1.equals(name1));//false
	   
	   System.out.println("==================String  Buffer and String  Buffer==========================");
	   
	   StringBuffer nameBuffer1=new StringBuffer("Kamlesh");
	   StringBuffer nameBuffer2=new StringBuffer("Kamlesh");
	   
	   System.out.println(nameBuffer1.hashCode());
	   System.out.println(nameBuffer2.hashCode());
	  
	   System.out.println(nameBuffer1==nameBuffer2);//flase
	   System.out.println(nameBuffer1.equals(nameBuffer2));//flase
	   
	   System.out.println("==================StringBuilder and StringBuilder==========================");
	   
	   StringBuilder nameStringBuilder1=new StringBuilder("Kamlesh");
	   StringBuilder nameStringBuilder2=new StringBuilder("Kamlesh");
	   System.out.println(nameStringBuilder1==nameStringBuilder2);////flase
	   System.out.println(nameStringBuilder1.equals(nameStringBuilder2));//flase
	   
	   
   }
}
