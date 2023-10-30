package com.vk.api.sdk.events;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.vk.api.sdk.objects.audio.Audio;
import com.vk.api.sdk.objects.board.TopicComment;
import com.vk.api.sdk.objects.callback.*;
import com.vk.api.sdk.objects.callback.messages.CallbackMessage;
import com.vk.api.sdk.objects.messages.Message;
import com.vk.api.sdk.objects.photos.Photo;
import com.vk.api.sdk.objects.video.Video;
import com.vk.api.sdk.objects.wall.WallComment;
import com.vk.api.sdk.objects.wall.Wallpost;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public abstract class EventsHandler {

    private static final Logger LOG = LoggerFactory.getLogger(EventsHandler.class);

    protected final Gson gson = new Gson();

    private <T> T designateObject(JsonObject object, Events type) {
        return gson.fromJson(object, type.getType());
    }

    protected String confirmation() {
        return null;
    }

    protected void messageNew(Integer groupId, MessageObject message) {
        
    }
    protected void messageEvent(Integer groupId, MessageEvent message) {
        
    }

    protected void messageReply(Integer groupId, Message message) {
        
    }

    protected void messageEdit(Integer groupId, Message message) {
        
    }

    protected void messageAllow(Integer groupId, MessageAllow message) {
        
    }

    protected void messageDeny(Integer groupId, MessageDeny message) {
        
    }

    protected void photoNew(Integer groupId, Photo message) {
        
    }

    protected void photoCommentNew(Integer groupId, PhotoComment message) {
        
    }

    protected void photoCommentEdit(Integer groupId, PhotoComment message) {
        
    }

    protected void photoCommentRestore(Integer groupId, PhotoComment message) {
        
    }

    protected void photoCommentDelete(Integer groupId, PhotoCommentDelete message) {
        
    }

    protected void audioNew(Integer groupId, Audio message) {
        
    }

    protected void videoNew(Integer groupId, Video message) {
        
    }

    protected void videoCommentNew(Integer groupId, VideoComment message) {
        
    }

    protected void videoCommentEdit(Integer groupId, VideoComment message) {
        
    }

    protected void videoCommentRestore(Integer groupId, VideoComment message) {
        
    }

    protected void videoCommentDelete(Integer groupId, VideoCommentDelete message) {
        
    }

    protected void wallPostNew(Integer groupId, Wallpost message) {
        
    }

    protected void wallRepost(Integer groupId, Wallpost message) {
        
    }

    protected void wallReplyNew(Integer groupId, WallComment object) {
        
    }

    protected void wallReplyEdit(Integer groupId, WallComment message) {
        
    }

    protected void wallReplyRestore(Integer groupId, WallComment message) {
        
    }

    protected void wallReplyDelete(Integer groupId, WallCommentDelete message) {
        
    }

    protected void boardPostNew(Integer groupId, TopicComment message) {
        
    }

    protected void boardPostEdit(Integer groupId, TopicComment message) {
        
    }

    protected void boardPostRestore(Integer groupId, TopicComment message) {
        
    }

    protected void boardPostDelete(Integer groupId, BoardPostDelete message) {
        
    }

    protected void marketCommentNew(Integer groupId, MarketComment message) {
        
    }

    protected void marketCommentEdit(Integer groupId, MarketComment message) {
        
    }

    protected void marketCommentRestore(Integer groupId, MarketComment message) {
        
    }

    protected void marketCommentDelete(Integer groupId, MarketCommentDelete message) {
        
    }

    protected void groupLeave(Integer groupId, GroupLeave message) {
        
    }

    protected void groupJoin(Integer groupId, GroupJoin message) {
        
    }

    protected void groupChangeSettings(Integer groupId, GroupChangeSettings message) {
        
    }

    protected void groupChangePhoto(Integer groupId, GroupChangePhoto message) {
        
    }

    protected void groupOfficersEdit(Integer groupId, GroupOfficersEdit message) {
        
    }

    protected void pollVoteNew(Integer groupId, PollVoteNew message) {
        
    }

    protected void userBlock(Integer groupId, UserBlock message) {
        
    }

    protected void userUnblock(Integer groupId, UserUnblock message) {
        
    }

    protected String parse(CallbackMessage message) {
        switch (message.getType()) {
            case CONFIRMATION:
                return confirmation();
            case MESSAGE_NEW:
                messageNew(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case MESSAGE_EVENT:
                messageEvent(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case MESSAGE_REPLY:
                messageReply(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case MESSAGE_EDIT:
                messageEdit(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case MESSAGE_ALLOW:
                messageAllow(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case MESSAGE_DENY:
                messageDeny(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case PHOTO_NEW:
                photoNew(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case PHOTO_COMMENT_NEW:
                photoCommentNew(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case PHOTO_COMMENT_EDIT:
                photoCommentEdit(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case PHOTO_COMMENT_RESTORE:
                photoCommentRestore(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case PHOTO_COMMENT_DELETE:
                photoCommentDelete(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case AUDIO_NEW:
                audioNew(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case VIDEO_NEW:
                videoNew(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case VIDEO_COMMENT_NEW:
                videoCommentNew(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case VIDEO_COMMENT_EDIT:
                videoCommentEdit(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case VIDEO_COMMENT_RESTORE:
                videoCommentRestore(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case VIDEO_COMMENT_DELETE:
                videoCommentDelete(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case WALL_POST_NEW:
                wallPostNew(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case WALL_REPOST:
                wallRepost(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case WALL_REPLY_NEW:
                wallReplyNew(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case WALL_REPLY_EDIT:
                wallReplyEdit(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case WALL_REPLY_RESTORE:
                wallReplyRestore(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case WALL_REPLY_DELETE:
                wallReplyDelete(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case BOARD_POST_NEW:
                boardPostNew(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case BOARD_POST_EDIT:
                boardPostEdit(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case BOARD_POST_RESTORE:
                boardPostRestore(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case BOARD_POST_DELETE:
                boardPostDelete(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case MARKET_COMMENT_NEW:
                marketCommentNew(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case MARKET_COMMENT_EDIT:
                marketCommentEdit(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case MARKET_COMMENT_RESTORE:
                marketCommentRestore(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case MARKET_COMMENT_DELETE:
                marketCommentDelete(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case GROUP_LEAVE:
                groupLeave(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case GROUP_JOIN:
                groupJoin(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case GROUP_CHANGE_SETTINGS:
                groupChangeSettings(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case GROUP_CHANGE_PHOTO:
                groupChangePhoto(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case GROUP_OFFICERS_EDIT:
                groupOfficersEdit(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case USER_BLOCK:
                userBlock(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case USER_UNBLOCK:
                userUnblock(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case POLL_VOTE_NEW:
                pollVoteNew(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            default:
                return null;
        }
        return "OK";
    }
}
