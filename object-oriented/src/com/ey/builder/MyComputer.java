package com.ey.builder;

interface Builder {

	void setRam();

	void setStorage();

	void setCpu();

	Mynam getResult();
}

class Mynam implements Builder {

	int ram;
	int storage;
	String cpu;
	String gpu;

	public Mynam(int ram, int storage, String cpu, String gpu) {

		this.ram = ram;
		this.storage = storage;
		this.cpu = cpu;
		this.gpu = gpu;
	}

	@Override
	public String toString() {
		return "Computer [ram=" + ram + ", storage=" + storage + ", cpu=" + cpu + ", gpu=" + gpu + "]";
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public Mynam getResult() {
		return new Mynam(ram, storage, cpu, gpu);
	}

	@Override
	public void setRam() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setStorage() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setCpu() {
		// TODO Auto-generated method stub

	}

}

class Director {
	public Mynam constructProduct(Builder builder) {
		builder.setStorage();
		builder.setCpu();
		builder.setRam();

		return builder.getResult();
	}
}

public class MyComputer {

	public static void main(String[] args) {
		Builder builder = new Mynam(1, 512, "intel", "dual");
		Director director = new Director();
		Mynam product = director.constructProduct(builder);

		System.out.println("Computer Specs: " + product.toString());
	}

}
