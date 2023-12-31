package com.example.demo.repository;

import com.example.demo.entity.ChatLieu;
import com.example.demo.entity.HoaTiet;
import com.example.demo.entity.MauSac;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface MauSacRepository extends JpaRepository<MauSac, UUID> {

    @Query("select ms from MauSac ms order by ms.ngayTao desc ")
    Page<MauSac> getAll(Pageable pageable);

    @Query("select ms from MauSac  ms where ms.daXoa=false")
    List<MauSac> getAllByStatus();
}
