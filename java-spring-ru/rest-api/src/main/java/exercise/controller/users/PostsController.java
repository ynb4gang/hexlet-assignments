package exercise.controller.users;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

import exercise.model.Post;
import exercise.Data;

// BEGIN
@RestController
@GetMapping("/api")
public class PostsController {
    private List<Post> posts = Data.getPosts();

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/users/{userId}/posts")
    public Post create(@PathVariable Integer userId, @RequestBody Post post) {
        post.setUserId(UserId);
        post.add(post);
        return post;
    }

    @GetMapping("/users/{userId}/posts")
    public List<Post> show(@PathVariable Integer userId) {
        return posts.stream()
                    .filter(p -> p.getUserId().equals(userId)).toList();
    }
}
// END
