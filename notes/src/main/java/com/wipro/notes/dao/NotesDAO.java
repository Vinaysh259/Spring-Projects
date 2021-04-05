package com.wipro.notes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.notes.model.Note;

@Repository
public interface NotesDAO extends JpaRepository<Note, Long>{
	
}

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import com.wipro.notes.model.Note;
//
//
//
//@Repository
//public class NotesDAO {
//	
//	@Autowired
//	private JdbcTemplate jdbctemplate;
//	
//	private static String SQL = "SELECT * FROM notes";
//	
//	Logger log = LoggerFactory.getLogger(NotesDAO.class);
//	
//	public List<Note> retrieveNotes(){
//		
//		List<Note> notes = new ArrayList<Note>();
//		List<Map<String,Object>> rows = jdbctemplate.queryForList(SQL);
//		
//		log.info("records from database",rows);
//		
//		for(Map<String,Object> row : rows) {
//			
//			Note note = new Note();
//			
//			note.setId((int) row.get("id"));
//			note.setName((String)row.get("name"));
//			note.setSubject((String)row.get("subject"));
//			
//			notes.add(note);
//		}
//		
//		return notes;
//	}
//	
//	
//}
