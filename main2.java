interface Document {
    void Open();
}

class Report implements Document {
    @Override
    public void Open() {
        System.out.println("Open Report");
    }
}

class Resume implements Document {
    @Override
    public void Open() {
        System.out.println("Open Resume");
    }
}

class Letter implements Document {
    @Override
    public void Open() {
        System.out.println("Open Letter");
    }
}

abstract class DocumentCreator {
    public abstract Document createDocument();
}

class ReportCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new Report();
    }
}

class ResumeCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new Resume();
    }
}

class LetterCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new Letter();
    }
}

public class main2 {
    public static void main(String[] args) {
        DocumentCreator reportCreator = new ReportCreator();
        Document report = reportCreator.createDocument();
        report.Open();

        DocumentCreator resumeCreator = new ResumeCreator();
        Document resume = resumeCreator.createDocument();
        resume.Open();

        DocumentCreator letterCreator = new LetterCreator();
        Document letter = letterCreator.createDocument();
        letter.Open();
    }
}
