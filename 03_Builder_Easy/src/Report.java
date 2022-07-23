public class Report {

    private String Header;
    private String Title;
    private String Content;
    private String Table;
    private int PageNumber;

    public String getHeader() {
        return Header;
    }

    public String getTitle() {
        return Title;
    }

    public String getContent() {
        return Content;
    }

    public String getTable() {
        return Table;
    }

    public int getPageNumber() {
        return PageNumber;
    }

    @Override
    public String toString() {
        return "Report{" +
                "Header='" + Header + '\'' +
                ", Title='" + Title + '\'' +
                ", Content='" + Content + '\'' +
                ", Table='" + Table + '\'' +
                ", PageNumber='" + PageNumber + '\'' +
                '}';
    }
}
