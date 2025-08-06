package app.hinabi.hinabi.model;

public enum MetricKey {
    PAGES_READ("pagesRead"),
    VOCABULARY_COUNT("vocabularyCount"),
    TOPICS_COVERED("topicsCovered"),
    SPEAKING_DURATION("speakingDuration"),
    VIDEO_DURATION("videoDuration"),
    PODCAST_DURATION("podcastDuration"),
    COMPREHENSION_RATE("comprehensionRate"),
    DIFFICULTY_LEVEL("difficultyLevel");

    private final String key;

    MetricKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
