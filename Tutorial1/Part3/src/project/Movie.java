package project;

public class Movie {
	private String title;
	private int productionYear;
	private String directorName;
	private String actorsList[]=new String[20] ;
	private String synopsis;
	private int actorsNumber; 
	
	public Movie() {
		
	}
	public Movie(String title,int productionYear,String directorName,String actor,String synopsis) {
		this.title=title;
		this.productionYear=productionYear;
		this.directorName=directorName;
		this.synopsis=synopsis;
        actorsList[actorsNumber]=actor;
        actorsNumber++;
		
	}
	public void addActor(String act) {
		actorsList[actorsNumber]=act;
		actorsNumber++;
	}
	public void displayMovieInformation() {
		System.out.println("   ------------------------------");
		System.out.println("   Movie Information : ");
		System.out.println("     title : "+title);
		System.out.println("     production year : "+productionYear);
		System.out.println("     director name : "+directorName);
		System.out.println("     synopsis : "+synopsis);
		System.out.println("     actors list : ");
		for(int i=0;i<actorsNumber;i++) {
			System.out.println("        - "+actorsList[i]);
		}
		System.out.println("------------------------------");
	}   
}
