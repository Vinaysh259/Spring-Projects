package com.wipro.notes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.notes.dao.NotesDAO;
import com.wipro.notes.model.Note;

@Service
public class NoteService{
	
	@Autowired
	NotesDAO noterepo;
	
	public Note addNote(String name, String subject) {
		
		Note new_note = new Note();
		new_note.setName(name);
		new_note.setSubject(subject);
		
		noterepo.save(new_note);
		return new_note;
	}
	
	public List<Note> listNotes(){
		List<Note> notes = noterepo.findAll();
		
		if(notes.size() > 0) {
			return notes;
		}
		
		else {
			return new ArrayList<Note>();
		}
	}
	
}

//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//import com.wipro.notes.model.*;
//
//@Service
//public class NoteService {
//	
//	private static List<Note> notes = new ArrayList<Note>();
//	
//	static {
//		
//		notes.add(new Note(1,"Shopping List","1. Get a pant, 2. Get a Shirt"));
//		notes.add(new Note(2,"Grocery List","Banana,Apple"));
//	}
//	
//	public Note addNote(String name, String subject) {
//		
//		int id = notes.size();
//		Note note = new Note(++id,name,subject);
//		notes.add(note);
//		return note;
//	}
//	
//	public List<Note> listNotes(){
//		return notes;
//	}
//	
//
//}
