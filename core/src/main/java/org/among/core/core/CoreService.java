package org.among.core.core;

import org.springframework.stereotype.Service;

@Service
public class CoreService {
    public void coreLogic() {
        System.out.println("핵심 비즈니스 로직이 시작되었습니다.");
        System.out.println("핵심 비즈니스 로직이 수행중입니다.");
        System.out.println("핵심 비즈니스 로직이 완료되었습니다.");
    }
}
