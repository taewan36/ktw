package com.icia.ktw.service;


import com.icia.ktw.dto.MemberDetailDTO;
import com.icia.ktw.dto.MemberLoginDTO;
import com.icia.ktw.dto.MemberSaveDTO;
import com.icia.ktw.dto.MemberUpdateDTO;

import java.io.IOException;
import java.util.List;

public interface MemberService {
    Long save(MemberSaveDTO memberSaveDTO) throws IOException;

    boolean login(MemberLoginDTO memberLoginDTO);

    List<MemberDetailDTO> findAll();

    MemberDetailDTO findById(Long memberId);

    void deleteById(Long memberId);

    Long update(MemberUpdateDTO memberUpdateDTO);

    MemberDetailDTO mypage(String memberEmail);

    boolean emailCheck(String memberEmail);
}
