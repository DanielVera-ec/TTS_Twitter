package com.tts.Twitter_I.repository;

import org.springframework.data.repository.CrudRepository;

import com.tts.Twitter_I.model.Tag;

public interface TagRepository extends CrudRepository<Tag, Long> {
	public Tag findByPhrase(String phrase);
}
