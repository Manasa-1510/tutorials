package com.example.model;

import java.util.*;

public class MusicExpert{

	public List getMusic(String rasa){
		List raagas = new ArrayList();
		if(rasa.equals("Joy")){
			raagas.add("Hamsadhvani");
			raagas.add("Kedaara");
			raagas.add("Mohana");
		}
		else if(rasa.equals("Bhakti")){
			raagas.add("Kharaharapriya");
		}else if(rasa.equals("Courage")){
			raagas.add("Bilahari");
			raagas.add("Beegada");
			raagas.add("Devagandhari");
		}else if(rasa.equals("Calm")){
			raagas.add("shyaama");
			raagas.add("vasanta");
		}

		return raagas;
	}
}