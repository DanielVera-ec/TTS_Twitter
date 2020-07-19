package com.tts.Twitter_I.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.Twitter_I.model.Tweet;
import com.tts.Twitter_I.model.User;



@Repository
public interface TweetRepository extends CrudRepository<Tweet, Long> {
	  public List<Tweet> findAllByOrderByCreatedAtDesc();
	  public List<Tweet> findAllByUserOrderByCreatedAtDesc(User user);
	  public List<Tweet> findAllByUserInOrderByCreatedAtDesc(List<User> users);
	  public List<Tweet> findByTags_PhraseOrderByCreatedAtDesc(String phrase);
	}

