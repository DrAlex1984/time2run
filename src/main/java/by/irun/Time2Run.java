package by.irun;

import java.sql.Date;
import java.sql.SQLException;
import java.time.Duration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import by.irun.dao.CRUDHandler;
import by.irun.domain.Club;
import by.irun.domain.Gender;
import by.irun.domain.Park;
import by.irun.domain.Race;
import by.irun.domain.Result;
import by.irun.domain.Runner;
import by.irun.domain.User;

@SpringBootApplication
public class Time2Run {

	private static CRUDHandler CRUD ;
	
	public static void main(String[] args) {
		CRUD = SpringApplication.run(Time2Run.class).getBean(CRUDHandler.class);
		fillingTestData();
	}
	
	private static void fillingTestData(){
		
		User user1 = new User();
		user1.setEmail("email1");
		user1.setLogin("login1");
		user1.setPassword("password1");
		user1.setPhone("phone");
		
		User user2 = new User();
		user2.setEmail("email2");
		user2.setLogin("login2");
		user2.setPassword("password2");
		user2.setPhone("123456");
		
		User user3 = new User();
		user3.setEmail("email3");
		user3.setLogin("login3");
		user3.setPassword("password3");
		user3.setPhone("1234561");
		
		User user4 = new User();
		user4.setEmail("email4");
		user4.setLogin("login4");
		user4.setPassword("password4");
		user4.setPhone("123456");
		
		User user5 = new User();
		user5.setEmail("email5");
		user5.setLogin("login5");
		user5.setPassword("password5");
		user5.setPhone("1234565");
		
		User user6 = new User();
		user6.setEmail("email6");
		user6.setLogin("login6");
		user6.setPassword("password6");
		user6.setPhone("1234566");
		
		User user7 = new User();
		user7.setEmail("email7");
		user7.setLogin("login7");
		user7.setPassword("password7");
		user7.setPhone("1234567");
		
		User user8 = new User();
		user8.setEmail("email8");
		user8.setLogin("login8");
		user8.setPassword("password8");
		user8.setPhone("1234568");
		
		User user9 = new User();
		user9.setEmail("email9");
		user9.setLogin("login9");
		user9.setPassword("password9");
		user9.setPhone("1234569");
		
		User user10 = new User();
		user10.setEmail("email10");
		user10.setLogin("login10");
		user10.setPassword("password10");
		user10.setPhone("12345610");
		
		try {
			CRUD.add(user1);
			CRUD.add(user2);
			CRUD.add(user3);
			CRUD.add(user4);
			CRUD.add(user5);
			CRUD.add(user6);
			CRUD.add(user7);
			CRUD.add(user8);
			CRUD.add(user9);
			CRUD.add(user10);
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		}
		
		Club club1 = new Club();
		Club club2 = new Club();
		club1.setAdmin(user1);
		club2.setAdmin(user2);
		club1.setBaseCity("Minsk");
		club2.setBaseCity("Brest");
		club1.setName("MINSKRUN CLUB");
		club2.setName("IRun Brest");
		
		try {
			CRUD.add(club1);
			CRUD.add(club2);
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		}
		
		Runner r1 = new Runner();
		r1.setUser(user1);
		r1.setCurrentClub(club1);
		r1.setDateOfBirth(Date.valueOf("1980-01-01"));
		r1.setCity("Minsk");
		r1.setGender(Gender.MALE);
		r1.setFirstName("Damon");
		r1.setLastName("Hill");
		
		Runner r2 = new Runner();
		r2.setUser(user2);
		r2.setCurrentClub(club2);
		r2.setDateOfBirth(Date.valueOf("1982-02-02"));
		r2.setCity("Brest");
		r2.setGender(Gender.FEMALE);
		r2.setFirstName("Василиса");
		r2.setLastName("Микулишна");
		
		Runner r3 = new Runner();
		r3.setUser(user3);
		r3.setCurrentClub(club1);
		r3.setDateOfBirth(Date.valueOf("1999-09-09"));
		r3.setCity("Minsk");
		r3.setGender(Gender.MALE);
		r3.setFirstName("Амвросий");
		r3.setLastName("Череззаборногузадерищенко");
		
		Runner r4 = new Runner();
		r4.setUser(user4);
		r4.setCurrentClub(club1);
		r4.setDateOfBirth(Date.valueOf("1960-01-21"));
		r4.setCity("Minsk");
		r4.setGender(Gender.MALE);
		r4.setFirstName("Ибрагим");
		r4.setLastName("Удмурт");
		
		Runner r5 = new Runner();
		r5.setUser(user5);
		r5.setCurrentClub(club1);
		r5.setDateOfBirth(Date.valueOf("1985-05-05"));
		r5.setCity("Minsk");
		r5.setGender(Gender.FEMALE);
		r5.setFirstName("Ангелина");
		r5.setLastName("Петрова");
		
		Runner r6 = new Runner();
		r6.setUser(user6);
		r6.setCurrentClub(club1);
		r6.setDateOfBirth(Date.valueOf("1990-09-09"));
		r5.setCity("Minsk");
		r6.setGender(Gender.MALE);
		r6.setFirstName("Константин");
		r6.setLastName("Константинов");
		
		Runner r7 = new Runner();
		r7.setUser(user7);
		r7.setDateOfBirth(Date.valueOf("1987-07-07"));
		r7.setCity("Minsk");
		r7.setGender(Gender.MALE);
		r7.setFirstName("Mika");
		r7.setLastName("Hakkinen");
		
		Runner r8 = new Runner();
		r8.setUser(user8);
		r8.setCurrentClub(club1);
		r8.setDateOfBirth(Date.valueOf("1998-09-08"));
		r8.setCity("Minsk");
		r8.setGender(Gender.FEMALE);
		r8.setFirstName("Мишель");
		r8.setLastName("Обама");
		
		Runner r9 = new Runner();
		r9.setUser(user9);
		r9.setCurrentClub(club1);
		r9.setDateOfBirth(Date.valueOf("1989-09-07"));
		r9.setCity("Minsk");
		r9.setGender(Gender.MALE);
		r9.setFirstName("Бонифаций");
		r9.setLastName("Торнсунен");
		
		Runner r10 = new Runner();
		r10.setUser(user10);
		r10.setCurrentClub(club1);
		r10.setDateOfBirth(Date.valueOf("1955-01-01"));
		r10.setCity("Minsk");
		r10.setGender(Gender.MALE);
		r10.setFirstName("Александр");
		r10.setLastName("Отто");
		
		try {
			CRUD.add(r1);
			CRUD.add(r2);
			CRUD.add(r3);
			CRUD.add(r4);
			CRUD.add(r5);
			CRUD.add(r6);
			CRUD.add(r7);
			CRUD.add(r8);
			CRUD.add(r9);
			CRUD.add(r10);
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		}
		
		Park park1 = new Park();
		park1.setName("Парк Калиновского");
		Park park2 = new Park();
		park2.setName("Брестский парк");
		
		try {
			CRUD.add(park1);
			CRUD.add(park2);
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		}
		
		try {
			createRace(park1,Date.valueOf("2020-01-4"),r5,r9,r4,r3,r1,r5,r8,r7,r2,r10);
			createRace(park1,Date.valueOf("2020-01-11"),r2,r1,r7,r5,r5,r9,r8,r10);
			createRace(park1,Date.valueOf("2020-01-18"),r1,r2,r3,r4,r5,r5,r7,r8,r9,r10);
			createRace(park2,Date.valueOf("2020-01-19"),r10,r4,r3,r5,r7,r1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Data has been submitted successfully");
	}
	
	private static void createRace(Park park, Date date, Runner...runners) throws SQLException{
		Race race = new Race();
		race.setPark(park);
		race.setDate(date);
		CRUD.add(race);
		int pos = 1;
		long seconds = (int)(Math.random()*1800);
		for(Runner r:runners){
			Result res = new Result();
			res.setAbsolutePosition(pos++);
			res.setGender(r.getGender());
			res.setRace(race);
			res.setTime(Duration.ofSeconds(seconds+=(Math.random()*60)));
			res.setClub(r.getCurrentClub());
			res.setRunner(r);
			CRUD.add(res);
		}
	}

}
