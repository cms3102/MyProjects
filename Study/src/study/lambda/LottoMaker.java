package study.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * 로또 번호를 뽑아서 대박을 내어보자꾸나!
 * 
 * @author JeongWon
 *
 */
public class LottoMaker {

	public static void main(String[] args) {
		new LottoMaker();
	}

	Scanner sc = new Scanner(System.in);
	public static final int LOTTO_NUMBER_LIMIT = 45;

	public LottoMaker() {
		System.out.println("인생역전의 기회 [ Lotto ] 번호 생성기!!");
		Random random = new Random();
		List<Integer> numberList = new ArrayList<>();
		do {
			int lottoNumber = random.nextInt(LOTTO_NUMBER_LIMIT) + 1;
			
		} while (numberList.size() < 7);
		numberList.add(5);
		numberList.forEach(System.out::println);
	}

}
