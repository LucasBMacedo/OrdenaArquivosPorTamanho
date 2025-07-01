package controller;

import java.io.File;
import java.io.IOException;

public class recebeCaminho {
	
	public void readDir(String path) throws IOException {
		File dir = new File (path);
		if (dir.exists() && dir.isDirectory()) {
			File[] files = dir.listFiles();
			int n = files.length;
		    for (int i = 0; i < n - 1; i++) {
		        for (int j = 0; j < n - i - 1; j++) {
		            if (files[j].length() > files[j + 1].length()) {
		                File temp = files[j];
		                files[j] = files[j + 1];
		                files[j + 1] = temp;
		            }
		        }
		    }
			for (File f : files) {
				if (f.isFile()) {
					double tamanhoMB = (double) f.length() / 1024 / 1024;
					System.out.println("     \t" + f.getName() + " Tamanho: " + tamanhoMB);
				}
			}
		} else {
			throw new IOException("Diretório inválido");
		}
	}
}
		
