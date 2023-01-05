package back.domain.comment.controller;

import back.domain.comment.dto.CommentPatchDto;
import back.domain.comment.dto.CommentPostDto;
import back.domain.utils.testStub;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {

    @PostMapping
    public ResponseEntity commentPost(@RequestBody CommentPostDto commentPostDto){

        return new ResponseEntity<>(
                testStub.createCommentResponseDto(), HttpStatus.CREATED);
    }

    /* comment 단건 조회 */
    @GetMapping("/{commentId}")
    public ResponseEntity commentGet(@PathVariable Long commentId){

        return new ResponseEntity<>(
                testStub.createCommentResponseDto(), HttpStatus.OK);
    }

    /* comment 전체 조회 */
    @GetMapping
    public ResponseEntity commentGets(){

        return new ResponseEntity<>(
                testStub.createCommentResponseDto(), HttpStatus.OK);
    }

    /* comment 수정 */
    @PatchMapping("/{commentId}")
    public ResponseEntity commentPatch(@PathVariable Long commentId,
                                       @RequestBody CommentPatchDto commentPatchDto){

        return new ResponseEntity<>(
                testStub.createCommentResponseDto(), HttpStatus.OK);
    }

    /* comment 삭제 */
    @DeleteMapping("/{commentId}")
    public ResponseEntity commentDelete(@PathVariable Long commentId){

        return new ResponseEntity<>(
                testStub.createCommentResponseDto(), HttpStatus.OK);
    }
}
