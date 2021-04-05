package com.wipro.notes.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.notes.dao.NotesDAO;
import com.wipro.notes.model.Note;
import com.wipro.notes.service.NoteService;

@Controller
public class NoteController {
	
	@Autowired
	NoteService noteservice;
	
	@RequestMapping("/homepage")
	public String homePage() {
		return "homepage";
	}
	
	@RequestMapping("shownotes")
	public String getNotes(ModelMap model) {
		
		model.put("notes",noteservice.listNotes());
		return "shownotes";
	}
	
	@RequestMapping("addnote")
	public String addNoteForm() {
		return "addnotes";
	}
	
	
	@RequestMapping("addnotes")
	public String addNotes(HttpServletRequest request, ModelMap model) {
		
		String name = request.getParameter("name");
		String subject = request.getParameter("subject");
		Note new_note = noteservice.addNote(name, subject);
		
		model.addAttribute("note", new_note);
		
		return "savednote";
	}
	
	
}
