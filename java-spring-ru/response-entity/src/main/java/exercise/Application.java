package exercise;

import java.net.URI;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import exercise.model.Post;

@SpringBootApplication
@RestController
public class Application {
    // Хранилище добавленных постов
    private List<Post> posts = Data.getPosts();

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // BEGIN
    @GetMapping("/posts")
    public ResponseEntity<List<Post>> index(
        @RequestParam(defaultValue = 1) Integer page,
        @RequestParam(defaultValue = 10) Integer limit) {

        return ResponseEntity.ok()
                            .header("X-Total-Count", String.valueOf(posts.size()))
                            .body(posts.stream().skip((page - 1) * limit).limit(limit).toList());
    }

    @GetMapping("/posts/{id}")
    public ResponseEntity<Post> show(@PathVariable String id) {
        var post = posts.stream()
                        .filter(p -> p.getId().equals(id))
                        .findFirst();
        return PesponseEntity.of(post);
    }
    
    @PostMapping("/posts")
    public ResponseEntity<Post> create(@RequestBody Post post ) {
        posts.add(post);
        URI location = URI.create("/posts");
        return ResponceEntity.created(location).body(post);
    }

    @PutMapping("/posts/{id}")
    public ResponseEntity<Post> update(@PathVariable String id, @RequestBody Post data) {
        var somePost = posts.stream()
                            .filter(p -> p.getId().equals(id))
                            .findFirst();
        var status = HttpStatus.NO_CONTENT;
        if (somePost.isPresent()) {
            var post = somePost.get();
            post.setId(data.getId());
            post.setTitle(data.getTitle());
            post.setBody(data.getBody());
        }
        return ResponceEntity.status(status).body(data);
    }
    // END

    @DeleteMapping("/posts/{id}")
    public void destroy(@PathVariable String id) {
        posts.removeIf(p -> p.getId().equals(id));
    }
}
