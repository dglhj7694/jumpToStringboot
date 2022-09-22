package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;

@SpringBootTest
class SbbApplicationTests {
	@Autowired
	private QuestionRepository qeustionRepository;

	@Autowired
	private AnswerRepository answerRepository;
	@Transactional
	@Test
	void testJpa() {
		/*
		 * Question q1 = new Question(); q1.setSubject("ssb ??");
		 * q1.setContent("ssb??"); q1.setCreateDate(LocalDateTime.now());
		 * this.qeustionRepository.save(q1);
		 * 
		 * Question q2 = new Question(); q2.setSubject("subject2");
		 * q2.setContent("contents 2"); q2.setCreateDate(LocalDateTime.now());
		 * this.qeustionRepository.save(q2); //질문 저장
		 */

		/*
		 * List<Question> all = this.qeustionRepository.findAll(); assertEquals(2,
		 * all.size());
		 * 
		 * Question q = all.get(0); assertEquals("ssb ??",q.getSubject());
		 */

		/*
		 * Optional<Question> oq = this.qeustionRepository.findById(1); if
		 * (oq.isPresent()) { Question q = oq.get(); assertEquals("ssb ??",
		 * q.getSubject()); }
		 * 
		 * Question q = this.qeustionRepository.findBySubject("ssb ??"); assertEquals(1,
		 * q.getId());
		 * 
		 * q = this.qeustionRepository.findBySubjectAndContent("ssb ??", "ssb??");
		 * assertEquals(1, q.getId());
		 * 
		 * List<Question> qList = this.qeustionRepository.findBySubjectLike("ssb%");
		 * Question q1 = qList.get(0); assertEquals("ssb ??", q1.getSubject());
		 * 
		 * Optional<Question> oq1 = this.qeustionRepository.findById(1);
		 * assertTrue(oq1.isPresent()); Question q2 = oq1.get();
		 * q2.setSubject("수정된 제목"); this.qeustionRepository.save(q2);
		 */

		// q data delete
		/*
		 * assertEquals(2, this.qeustionRepository.count()); Optional<Question> oq =
		 * this.qeustionRepository.findById(1); assertTrue(oq.isPresent()); Question q =
		 * oq.get(); this.qeustionRepository.delete(q); assertEquals(1,
		 * this.qeustionRepository.count());
		 */

		// answer create and save
		/*
		 * Optional<Question> oq = this.qeustionRepository.findById(2);
		 * assertTrue(oq.isPresent()); Question q = oq.get();
		 * 
		 * Answer a = new Answer(); a.setContent("네 자동으로 생성됩니다."); a.setQuestion(q);
		 * a.setCreateDate(LocalDateTime.now()); this.answerRepository.save(a);
		 */

		// 답변 조회하기
		/*
		 * Optional<Answer> oa = this.answerRepository.findById(1);
		 * assertTrue(oa.isPresent()); a = oa.get(); assertEquals(2,
		 * a.getQuestion().getId());
		 */

		Optional<Question> oq = this.qeustionRepository.findById(2);
		assertTrue(oq.isPresent());
		Question q = oq.get();

		List<Answer> answerList = q.getAnswerList();

		assertEquals(1, answerList.size());
		assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
	}
}
