package pl.splon.blog.models.forms;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PostForm {
    private String title;
    private String message;
    private String category;
}
