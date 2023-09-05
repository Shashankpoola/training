package com.ey. builder;
public static class Computer { 
		private String cpu; 
		private int ram; 
		private int hdd; 
		private int ssd; 
		private String gpu;
		public Computer (PCBuilder builder) {
			this. cpu = builder. cpu;
			this. ram = builder. ram;
			this.hdd = builder.hdd;
			this. ssd = builder.ssd;
			this. gpu = builder-gpu;
		}
@Override
public String toString() {
return "PC[CPU=" + cpu + ", RAM=" + ram + ", HDD=" + hdd +
", SSD=" + ssd
+
GF
public static class PCBuilder {
private final String cpu; private final int ram; private final int hdd;
private int ssd; private String gpu;
public Puilder(String cpu, int ram, int hdd) f
this. cpu = cpu;
this. ram = ram;