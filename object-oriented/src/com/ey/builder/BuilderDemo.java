package com.ey.builder;
public class BuilderDemo {
public static void main(String[] args) {
	Computer pc1 = new Computer.PCBuilder( "Intel i3", 16, 512).build();
	System. out. println(pc1);
	Computer pc2 = new Computer.PCBuilder ("Intel 15", 32, 512).setSsd(128).build();
	System. out. println(pc2);
	Computer pc3 = new Computer.PCBuilder ("Intel 17", 32, 512).setssd(128).setGpu( "NVidia").build();
	System.out. println(pc3) ;
}

}