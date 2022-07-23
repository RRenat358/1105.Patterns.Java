/**
 * Отчёт (unit)
 *
 */

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

    private Report(Builder builder) {
        this.Header = builder.Header;
        this.Title = builder.Title;
        this.Content = builder.Content;
        this.Table = builder.Table;
        this.PageNumber = builder.PageNumber;
    }


    /**
     * Сторитель
     */

    static class Builder {

        private String Header;
        private String Title;
        private String Content;
        private String Table;
        private int PageNumber;


        public Builder(String header) { //Обязательное поле
            Header = header;
        }

        public Builder setTitle(String title) {
            Title = title;
            return this;
        }

        public Builder setContent(String content) {
            Content = content;
            return this;
        }

        public Builder setTable(String table) {
            Table = table;
            return this;
        }

        public Builder setPageNumber(int pageNumber) {
            PageNumber = pageNumber;
            return this;
        }


        public Report build() {
            return new Report(this);
        }

    }


}
