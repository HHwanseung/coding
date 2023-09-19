package com.battle.coding.domain.repository.member;

import com.battle.coding.domain.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
