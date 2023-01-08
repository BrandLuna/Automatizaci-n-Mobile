package java.com.bdd.step;



import java.com.bdd.view.HomeView;
import java.com.bdd.view.ResultsView;

public class LinioStep {

    private HomeView homeView(){
        return new HomeView();
    }

    private ResultsView resultsView(){
        return new ResultsView();
    }

    public void searchLaptop(String video){
        homeView().goSearch();
        homeView().secondgoSearch();
        homeView().typeVideo(video);
        homeView().enterKeyBoard();
        homeView().secondenterKeyBoard();
    }

    public int getSizeResult(){
        return resultsView().getSizeResult();
    }

}
