package cz.zcu.kiv.crce.parser;

public enum Languages {
    JAVA("java");
    // CPP("cpp"), etc.

    private String language;

    Languages(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}
