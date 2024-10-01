import java.util.Scanner;
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
class Invoice implements Document {
    @Override
    public void Open() {
        System.out.println("Open Invoice");
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
class InvoiceCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new Invoice();
    }
}

public class main2 {
    public static void main(String[] args) {
        DocumentCreator reportCreator = new ReportCreator();
        Document report = reportCreator.createDocument();

        DocumentCreator resumeCreator = new ResumeCreator();
        Document resume = resumeCreator.createDocument();

        DocumentCreator letterCreator = new LetterCreator();
        Document letter = letterCreator.createDocument();

        DocumentCreator invoiceCreator = new InvoiceCreator();
        Document invoice = invoiceCreator.createDocument();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1- report 2- resume 3- letter 4-invoice");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                report.Open();
                break;
            case 2:
                resume.Open();
                break;
            case 3:
                letter.Open();
                break;
            case 4:
                invoice.Open();
                break;
            default:
                System.out.println("ot 1 do 4");
        }
    }
}
