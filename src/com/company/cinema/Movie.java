package com.company.cinema;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.scene.text.FontWeight;

public class Movie {

    public class Info {
        private String name;
        private int duration;
        private String trailer; //todo should be a url or relative path to the local video file
        private String plot;
        private float score;
        private Genre[] genres;


        //But wait!! There's more

        // region Constructor

        public Info(String name, int duration, String trailer, String plot, float score, Genre[] genres) {
            this.name = name;
            this.duration = duration;
            this.trailer = trailer;
            this.plot = plot;
            this.score = score;
            this.genres = genres;

        }

        // endregion Constructor

        // region accessors

        public float getScore() {
            return score;
        }

        public int getDuration() {
            return duration;
        }

        public String getName() {
            return name;
        }

        public String getPlot() {
            return plot;
        }

        public String getTrailer() {
            return trailer;
        }

        public Genre[] getGenres() {
            return genres;
        }
        // endregion accessors

        // region mutators

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPlot(String plot) {
            this.plot = plot;
        }

        public void setScore(float score) {
            this.score = score;
        }

        public void setTrailer(String trailer) {
            this.trailer = trailer;
        }

        public void setGenres(Genre[] genres) {
            this.genres = genres;
        }
        // endregion mutators
    }

    private int id;
    private boolean available;
    private int[] availableSessionsIndices;

    private ViewingOption[] viewingOptions;
    private Info info;

    private VBox vbx;

    //endregion Variables

    // region Constructor

    public Movie(int id, boolean available, int[] availableSessionsIndices, ViewingOption[] viewingOptions, String name, int duration, String trailer, String plot, float score, Genre[] genres) {
        this.id = id;
        this.available = available;
        this.availableSessionsIndices = availableSessionsIndices;
        this.viewingOptions = viewingOptions;
        this.info = new Info( name,  duration,  trailer,  plot ,score,  genres);

        initVBox();
    }

    private void initVBox() {
        Label lbl_movieTitle = new Label(info.getName());
        lbl_movieTitle.getStyleClass().add("MovieTitle");

        ImageView imageView = new ImageView(new Image(String.format("file:src/com/company/media/images/%d.jpg", id)));
        imageView.setFitHeight(445); //todo magicNumber
        imageView.setFitWidth(300);  //todo magicNumber

        Label lbl_caption = new Label(getGenresString());
        lbl_caption.getStyleClass().add("MovieCaption");

        HBox hbx_caption = new HBox();
        hbx_caption.setAlignment(Pos.CENTER);
        hbx_caption.getChildren().add(lbl_caption);

        Button btn_buy = new Button("Buy ticket");
        btn_buy.getStyleClass().add("btn");
        btn_buy.setPrefWidth(imageView.getFitWidth());

        vbx = new VBox();
        vbx.setPadding(new Insets(10, 50, 50, 50));//todo magic numbers
        vbx.setSpacing(10);//todo magic numbers
        vbx.getStyleClass().add("MovieCard");

        vbx.prefHeightProperty().unbind();

        vbx.getChildren().addAll(lbl_movieTitle, imageView, hbx_caption, btn_buy);
    }

    // endregion Constructor

    //region accessors

    public int getId() {
        return id;
    }

    public VBox getVbx() {
        return vbx;
    }

    public boolean isAvailable() {
        return available;
    }

    public Info getInfo() {
        return info;
    }

    public ViewingOption[] getViewingOptions() {
        return viewingOptions;
    }

    public int[] getAvailableSessionsIndices() {
        return availableSessionsIndices;
    }
    //endregion accessors

    //region mutators

    public void setId(int id) {
        this.id = id;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setViewingOptions(ViewingOption[] viewingOptions) {
        this.viewingOptions = viewingOptions;
    }

    public void setAvailableSessionsIndices(int[] availableSessionsIndices) {
        this.availableSessionsIndices = availableSessionsIndices;
    }

    //endregion mutators

    private String getGenresString(){
        StringBuilder strBuilder = new StringBuilder();
        for (Genre genre: info.getGenres()) {
            strBuilder.append(genre.toString());
            strBuilder.append(", ");
        }
        strBuilder.setLength(strBuilder.length() - 2);
        return strBuilder.toString();
    }
}
