package com.pm.patientservice.service;

import com.pm.patientservice.model.Patient;
import com.pm.patientservice.repository.Patient.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    private PatientRepository patientRepository;
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
    public List<PatientResponseDTO> getPatient(){
        List<Patient> patients = patientRepository.findAll();
        return null;
    }
}
