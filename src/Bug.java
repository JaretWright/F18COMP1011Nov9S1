public class Bug implements Comparable<Bug>{
    private String description;
    private int severity;

    public Bug(String description, int severity) {
        setDescription(description);
        setSeverity(severity);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        if (severity >= 1 && severity <= 5)
            this.severity = severity;
        else
            throw new IllegalArgumentException("Severity must be 1-5");
    }

    @Override
    public int compareTo(Bug bug) {
        if (this.getDescription().equals(bug.description))
            return 0;

        if (this.getSeverity()>bug.getSeverity())
            return -1;
        else
            return 1;
    }

    @Override
    public String toString()
    {
        return String.format("%30s  impact:%d", getDescription(),
                                                getSeverity());
    }
}
