package com.riwi.Library.Management.infrastructure.Services;

import com.riwi.Library.Management.api.dtos.request.LoanReq;
import com.riwi.Library.Management.api.dtos.response.LoanResponse;
import com.riwi.Library.Management.infrastructure.abstractServices.ILoanService;
import com.riwi.Library.Management.infrastructure.helpers.mappers.LoanMapper;
import com.riwi.Library.Management.util.Exception.IdNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.riwi.Library.Management.domain.entities.Loan;
import com.riwi.Library.Management.domain.repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

@Service
@AllArgsConstructor
public class LoanService implements ILoanService {

    @Autowired
    LoanRepository loanRepository;

    @Autowired
    LoanMapper loanMapper;

    @Override
    public LoanResponse create(LoanReq request) {
        Loan loan = this.loanMapper.toEntity(request);
        return this.loanMapper.toResponse(this.loanRepository.save(loan));
    }

    @Override
    public Page<LoanResponse> getAll(int page, int size) {
        PageRequest pagination = PageRequest.of(page, size);
        Page<LoanResponse> response = loanRepository.findAll(pagination).map(loan -> loanMapper.toResponse(loan));
        return response;
    }

    @Override
    public LoanResponse update(LoanReq request, Long aLong) {
        Loan loan = loanMapper.toEntity(request);
        LoanResponse response = loanMapper.toResponse(loanRepository.save(loan));
        return response;
    }

    @Override
    public LoanResponse get(Long aLong) {
        Loan loan = loanRepository.findById(aLong).orElseThrow(()->new IdNotFoundException("Loan"));
        return loanMapper.toResponse(loan);
    }

    @Override
    public void delete(Long aLong) {
        loanRepository.findById(aLong).orElseThrow(()->new IdNotFoundException("Loan"));
        loanRepository.deleteById(aLong);
    }
}
