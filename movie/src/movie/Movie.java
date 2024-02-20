package movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor

public class Movie {

	private long id; // 영화 고유번호
	private String title; // 영화 제목
	private String genre; // 영화 장르

	private static final File file = new File("movies.txt");

//	public Movie(long id, String title, String genre) {
//		this.id = id;
//		this.title = title;
//		this.genre = genre;
//	}

	public Movie(String title, String genre) {
		this(Instant.now().getEpochSecond(), title, genre);
		Long id = Instant.now().getEpochSecond();
		System.out.println("id : " + Instant.now().getEpochSecond());

	}

	public static ArrayList<Movie> findAll() {
		ArrayList<Movie> movies = new ArrayList<>();

		BufferedReader br = null;
		String line = null;

		try {
			br = new BufferedReader(new FileReader(file));
			while ((line = br.readLine()) != null) {
				// line 에 현재 txt파일에서 읽어온 내용이 있음
				// 1627175707,에벤져스,판타지 >> 한 줄 읽어왔다.

				String[] temp = line.split(",");
				// temp[0] : 1627175707
				// temp[1] : 에벤져스
				// temp[2] : 판타지

				// 파일에서 읽어온 데이터는 문자로 인식한다.
				// 따라서 1627175707 = 문자다... 그러므로 id저장하기 위해서는
				// 문자열을 Long 형으로 변환하는 작업이 필요하다.
				Movie m = new Movie(Long.parseLong(temp[0]), temp[1], temp[2]);
				movies.add(m); // ArrayList에 파일 저장된 영화 목록 추가
			}

			br.close(); // 연결 끊기

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return movies; // 영화 객체가 담긴 ArrayList 반환
	}

//	@Override
//	public String toString() {
//		return "Movie [id=" + id + ", title=" + title + ", genre=" + genre + "]";
//	}

	@Override
	public String toString() {
		return String.format("[%d]: %s(%s)", id, title, genre);
		// 정수형 실수형
		// "[1627175707] : 어벤져스(판타지)"
	}

	public void save() {
		try {
			// movies.txt 파일에 이어서 쓰기 실행.
			FileWriter fw = new FileWriter(file, true);
			fw.write(this.toFileString() + "\n");
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private String toFileString() {
		return String.format("%d,%s,%s", id, title, genre);
	}

	public static void delete(String movieId) {
		BufferedReader br = null;
		String text = "";
		String line = "";

		try {
			br = new BufferedReader(new FileReader(file));

			while ((line = br.readLine()) != null) {
				String[] temp = line.split(",");
				if (movieId.equals(temp[0])) {
					continue;
				}
				text += line + "\n";
			}
			br.close();
			FileWriter fw = new FileWriter(file);
			fw.write(text);
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Movie findAll(String movieID) {
		
		Movie movie = null;
		BufferedReader bf = null;

		try {
			bf = new BufferedReader(new FileReader(file));
			String line = null;

			while ((line = bf.readLine()) != null) {
				String[] temp = line.split(",");
				if (movieID.equals(temp[0])) {
					movie = new Movie(Long.parseLong(temp[0]), temp[1], temp[2]);
					break;
				}
			}
			bf.close();
			return movie;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return movie;
	}
	
	public String getTitle() {
		return title;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
