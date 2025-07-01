package view;

import java.io.IOException;

import controller.recebeCaminho;

public class Principal {

	public static void main(String[] args) {
		recebeCaminho arqCont = new recebeCaminho();
		String path = "/Users/lucasbezerrademacedo/Documents";
		
		
		try {
			arqCont.readDir(path);
		} catch (IOException e) {
			e.printStackTrace();
		}	
		}
	}