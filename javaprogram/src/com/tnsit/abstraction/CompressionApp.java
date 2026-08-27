package com.tnsit.abstraction;

abstract class FileCompressor{
	abstract void compress(String filename);
	void showdetails() {
		System.out.println("Compression started...");
	}
}

class ZipCompressor extends FileCompressor{

	@Override
	void compress(String filename) {
		// TODO Auto-generated method stub
		System.out.println("Compressing using Gzip...");
		
		int originalsize=100;
		int compressedsize=originalsize*60/100;
		System.out.println("original size:"+originalsize+"MB");
		System.out.println("compressed size:"+compressedsize+"MB");
	}
	
}

class GzipCompressor extends FileCompressor{

	@Override
	void compress(String filename) {
		// TODO Auto-generated method stub
		System.out.println("Compressing using Gzip...");
		
		int originalsize=100;
		int compressedsize=originalsize*50/100;
		System.out.println("original size:"+originalsize+"MB");
		System.out.println("compressed size:"+compressedsize+"MB");
	}
	
}
public class CompressionApp {
public static void main(String[] args) {
	ZipCompressor z=new ZipCompressor();
	z.compress("project.zip");
	System.out.println();
	
	GzipCompressor g=new GzipCompressor();
	g.compress("project.zip");
}
}
