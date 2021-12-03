package com.student.table.studentquestiontable;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionTableController {

	@Autowired
	private QuestionRepository repo;
	@Autowired
	private ProfileRepository proRepo;
	@Autowired
	private TransactionRepository tranRepo;

	@Autowired
	private QuestionOptionsRepository queOpRepo;

	@Autowired
	private SessionRepository sesRepo;

	@Autowired
	private ScoreRepository scoRepo;

	@PostMapping("/profile")
	public void postProfile(@RequestBody Profile profile) {
		List<QuestionOptions> quOp = queOpRepo.getQuestionOption();
		for (Session p : profile.getSession()) {
			for (Transaction t : p.getTransaction()) {
				for (QuestionOptions Qp : quOp) {
					if (Qp.getId() == t.getAnswerId()) {
						if (Qp.getAnswer().contains("Y")) {
							t.setResult("true");
						} else {
							t.setResult("false");
						}
					}
				}
			}

		}

		Profile profileSave = proRepo.save(profile);

	}

	@GetMapping("/question-table")
	public List<Question> retriveQuestionValue() {

		Iterable<Question> question = repo.findAll();
		return (List<Question>) question;

	}

	@GetMapping("/profile-details")
	public List<Profile> retriveProfileValue() {

		Iterable<Profile> profile = proRepo.findAll();
		return (List<Profile>) profile;

	}

	@GetMapping("/profile-score/{id}")
	public Optional<Score> retriveScoreValue(@PathVariable Long id) {

		Optional<Score> score = scoRepo.findByProfileId(id);
		return score;

	}

	@GetMapping("/profile/{id}")
	public Optional<Profile> retriveProfileValue(@PathVariable Long id) {

		Optional<Profile> profile = proRepo.findById(id);
		return profile;

	}

	@GetMapping("/profilevvv")
	public String retrivedScore(@PathVariable Long id) {
		sesRepo.findById(id);
		int questionId = tranRepo.findById(1L).get().getQuestionId();
		int answerId = tranRepo.findById(1L).get().getAnswerId();
		System.out.println(questionId);
		System.out.println(answerId);
		return "Score " + "questionId " + questionId + " answerId  	" + answerId;
	}

	@GetMapping("/Question-and-answer")
	public void Ques() {
		List<Question> questionoption = repo.getdetails();
		for (Question q : questionoption) {
			System.out.println(q.getQuestion());
			for (QuestionOptions qes : q.getQuestionOption()) {
				if (qes.getAnswer().contains("Y"))
					System.out.println(qes.getOptions());
			}

		}

	}

	@GetMapping("/session/{id}")
	public String sessionvalue(@PathVariable Long id) {
		List<Session> session = sesRepo.getSession(id);
		List<QuestionOptions> quOp = queOpRepo.getQuestionOption();
		int Score = 0;
		int attempt = 0;
		Long Userid = 0L;
		for (Session s : session) {
			for (Transaction t : s.getTransaction()) {
				int n = t.getAnswerId();

				for (QuestionOptions Qp : quOp) {
					if (Qp.getId() == n) {
						if (Qp.getAnswer().contains("Y")) {
							Score++;
							attempt++;
							System.out.println("True");
						} else {
							attempt++;
							System.out.println("False");
						}
					}
				}
			}
		}
		return "The Attempt Question: " + attempt + " you have score: " + Score;
	}

}
