package com.naver.io.ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import com.naver.utill.ex1.StudentDTO;

public class StudentInfo {

	public ArrayList<StudentDTO> init() {
		File file =new File("C:\\Taehyun\\sub1\\sub2\\info.txt");
		ArrayList<StudentDTO> list =new ArrayList<>(); 
		try {
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			
			while(true) {
			String info =br.readLine();
			if(info==null) {
				break;
			}
			String [] ar=info.split("-");
			
				StudentDTO dto =new StudentDTO();
				dto.setName(ar[0]);
				dto.setKor(Integer.parseInt(ar[1]));
				dto.setEng(Integer.parseInt(ar[2]));
				dto.setMath(Integer.parseInt(ar[3]));
				list.add(dto);
				
			}			
			
		}
			
		 catch (Exception e) {
		
			e.printStackTrace();
				
		}
		
		return list;
		
	}
	
	
	
}
