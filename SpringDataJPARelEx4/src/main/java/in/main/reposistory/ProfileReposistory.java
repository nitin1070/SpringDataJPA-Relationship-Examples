package in.main.reposistory;


import org.springframework.data.jpa.repository.JpaRepository;

import in.main.model.Profile;
import in.main.model.User;

public interface ProfileReposistory  extends JpaRepository<Profile, Integer>{
	



}