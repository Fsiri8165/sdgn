package com.vagus.human;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadText {
	public static ArrayList<Human> readFile() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt"), "utf-8"));
			ArrayList<Human> al = new ArrayList<>();
			Human h = null;
			String line = null;
			String[] str = null;
			while((line = br.readLine()) != null) {
				str = line.split(" ");
				al.add(new Human(Integer.parseInt(str[0]), str[1], Integer.parseInt(str[2])));
			}
			return al;
		} catch (Exception e) {
			return null;
		} finally {
			try {
				br.close();
			} catch (IOException e) {
			}
		}
	}
}
