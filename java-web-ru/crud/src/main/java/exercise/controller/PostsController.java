package exercise.controller;

import static io.javalin.rendering.template.TemplateUtil.model;
import java.util.List;
import java.util.ArrayList;
import exercise.dto.posts.PostsPage;
import exercise.dto.posts.PostPage;
import exercise.model.Post;
import exercise.repository.PostRepository;

import io.javalin.http.Context;
import io.javalin.http.NotFoundResponse;

public class PostsController {

    // BEGIN
    public static void index(Context ctx) {
        var page = ctx.queryParamAsClass("page", Integer.class).getOrDefault(1);
        var per = 5;
        var begin = (page - 1) * per;
        var end = begin + per;
        var posts = PostRepository.getEntities();
        List<Post> sliceOfPosts;

        if (begin >= posts.size()) {
            sliceOfPosts = new ArrayList<>();
        } else if (end > posts.size()) {
            sliceOfPosts = posts.subList(begin, posts.size());
        } else {
            sliceOfPosts = posts.subList(begin, end);
        }

        var postPage = new PostsPage(sliceOfPosts, page);
        ctx.render("posts/index.jte", model("page", postPage));
    }

    public static void show(Context ctx) {
        var id = ctx.pathParamAsClass("id", Long.class).get();
        var post = PostRepository.find(id)
            .orElseThrow(() -> new NotFoundResponse("Post not found"));

        var page = new PostPage(post);
        ctx.render("posts/show.jte", model("page", page));
    }
    // END
}
