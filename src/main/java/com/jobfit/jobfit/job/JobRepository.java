package com.jobfit.jobfit.job;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository     
public class JobRepository {

    private final List<Job> jobs = new ArrayList<>();

    public JobRepository() {
        // 테스트용 데이터: 여러분이 관심 있는 회사로 바꿔도 됩니다
        jobs.add(new Job(1L, "회사A", "백엔드 개발자", "서울", LocalDate.of(2026, 12, 31)));
        jobs.add(new Job(2L, "회사B", "서버 개발자", "판교", LocalDate.of(2026, 12, 15)));
    }

    public List<Job> findAll() {
        return new ArrayList<>(jobs);
    }

    public Optional<Job> findById(Long id) {
        for(Job job : jobs){
            if(job.getId().equals(id)){
                return Optional.of(job);
            }
        }
        return Optional.empty();
    }   
    
}
