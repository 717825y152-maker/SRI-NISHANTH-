public abstract class Content {

    private int contentId;
    private String title;
    private String genre;
    private int releaseYear;
    private double rating;
    private boolean available;

    public Content(int contentId, String title, String genre,
                   int releaseYear, double rating) {
        this.contentId = contentId;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        setRating(rating);
        this.available = true;
    }

    public abstract void play();

    public int getContentId() {
        return contentId;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRating(double rating) {
        if (rating >= 0 && rating <= 10) {
            this.rating = rating;
        } else {
            throw new IllegalArgumentException(
                "Rating must be between 0 and 10");
        }
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String toString() {
        return contentId + " | " + title + " | "
                + genre + " | Rating: " + rating;
    }
}
