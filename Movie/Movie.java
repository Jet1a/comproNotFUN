package Movie;

public class Movie {

    private final String title;
    private final double hours;
    private final int grade;

    public Movie(String title, double hours, int grade) {
        this.title = title;
        this.hours = hours;
        this.grade = grade;
    }

    public String getTitle() {
        return title;
    }

    public double getHours() {
        return hours;
    }

    public int getGrade() {
        return grade;
    }

    public boolean equals(Movie m) {
        return this == m;
    }

    public int compareTo(Movie m) {
        if (this.getGrade() < grade) {
            return 1;
        } else if (this.getGrade() > grade) {
            return -1;
        } else
            return 0;
    }

    @Override
    public String toString() {
        return "Movie [title=" + title + ", hours=" + hours + ", grade=" + grade + "]";
    }

}

