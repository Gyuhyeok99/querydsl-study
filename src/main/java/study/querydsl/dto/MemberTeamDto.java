package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import study.querydsl.entity.Member;
import study.querydsl.entity.Team;

@Data
public class MemberTeamDto {

    private Long memberId;
    private String username;
    private int age;
    private Long teamId;
    private String teamName;

    @QueryProjection
    public MemberTeamDto(Member member, Team team) {
        memberId = member.getId();
        username = member.getUsername();
        age = member.getAge();
        teamId = team.getId();
        teamName = team.getName();
    }
}
