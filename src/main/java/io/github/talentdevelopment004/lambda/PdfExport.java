package io.github.talentdevelopment004.lambda;

public class PdfExport implements Export {

    @Override
    public void export(String content) {
        System.out.println("Exporting to Pdf " + content);
    }

}
