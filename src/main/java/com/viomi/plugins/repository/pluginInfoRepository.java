package com.viomi.plugins.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.viomi.plugins.pojo.pluginInfo;

public interface pluginInfoRepository  extends JpaRepository<pluginInfo,Long>,JpaSpecificationExecutor<pluginInfo>
{
    
}
