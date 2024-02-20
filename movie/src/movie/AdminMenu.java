package movie;

import java.util.ArrayList;

public class AdminMenu extends AbstractMenu {

	private static final AdminMenu instance = new AdminMenu(null);

	private static final String ADMIN_MENU_TEXT = 
			"1 : 영화 등록하기\n" + "2 : 영화 목록보기\n" + 
			"3 : 영화 삭제하기\n" + "b : 메인 메뉴로 이동\n" + 
			"메뉴를 선택하세요 : ";

	private AdminMenu(Menu prevMenu) {
		super(ADMIN_MENU_TEXT, prevMenu);
	}

	public static AdminMenu getInstance() {
		return instance; // AdminMenu 객체 생성 주소반환(싱글톤 패턴)
	}

	@Override
	public Menu next() {
		switch (sc.nextLine()) {
		case "1" : 
			createMovie();			// 영화 등록 진행
			return this;
		case "2" :
			printAllMovies();		// 영화 목록 출력
			return this;			// adminMenu(관리자 메뉴) 반환
		case "3":
			deleteMovie();
			return this;
		case "b":					// b 입력하면, 이전 메뉴 반환
			return prevMenu;		// 자기자신(AdminMenu) => new AdminMenu
		default:
			return this;
		}
	}
	
	private void deleteMovie() {
		printAllMovies();			// 영화 전체 목록 출력
		
		System.out.println("삭제할 영화를 선택하세요: ");
		
		Movie.delete(sc.nextLine());
		System.out.println(">> 삭제되었습니다.");
			
	}
	
	private void createMovie() {
		System.out.println("제목 : ");
		String title = sc.nextLine();	// 제목 입력
		
		System.out.println("장르 : ");
		String genre = sc.nextLine();
		
		Movie movie = new Movie(title, genre);
		
		movie.save();
		System.out.println(">> 저장되었습니다.");
	}

	private void printAllMovies() {
		
		ArrayList<Movie> movies = Movie.findAll();	// 모든 영화를 가져옴
		
		for(Movie movie : movies) {
			System.out.println(movie);
		}
	}

}
