package com.f1f1.f1f1.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CarController {

    // key = URL id (/cars/{id})
    private static final Map<String, Car> CAR_DB = new LinkedHashMap<>();

    static {
        CAR_DB.put("engine", new Car(
        "엔진",
        "1.6L V6 터보 하이브리드 엔진",
        List.of(
                "/images/cars/engine_1.webp",
                "/images/cars/engine_2.jpg",
                "/images/cars/engine_3.jpg"
        ),
        "포뮬러 1에서 엔진은 단순한 동력원이 아니라 차량 성능과 전략, 경쟁력을 좌우하는 핵심 요소다. \n2025년 F1 시즌 역시 2014년 도입된 1.6리터 V6 터보 하이브리드 파워 유닛 규정을 유지하며, 고출력과 고효율을 동시에 추구한다. \n내연기관은 90도 V6 구조에 최대 15,000rpm, 500bar 고압 직분사를 사용하고, 연료 유량은 10,500rpm 이상에서 시간당 100kg으로 제한된다. \n여기에 터보차저와 하이브리드 시스템이 결합돼, 제동 시 에너지를 회수하는 MGU-K와 배기가스 에너지를 활용하는 MGU-H가 출력을 보조한다. \n이 복합 시스템을 통해 엔진은 1,000마력 이상을 발휘하면서도 과거 세대 대비 연료 효율을 크게 개선했다.\n 2025년 파워 유닛 공급사는 페라리(하스,자우버), 메르세데스(맥라렌,윌리엄스,에스턴 마틴), 혼다 RBPT(레드불, 레이싱불스), 르노(알핀)로 구성되며 르노는 2025년을 마지막으로 엔진 생산을 중단한다.",
        "tech",
        
        Map.of()
        ));

        CAR_DB.put("aero", new Car(
        "공기역학",
        "그라운드 이펙트, 윙",
        List.of(
                "/images/cars/aero.jpg",
                "/images/cars/aero_1.jpg",
                "/images/cars/aero_2.png",
                "/images/cars/aero_3.jpg",
                "/images/cars/aero_4.jpg"
        ),
        "포뮬러 1에서 공기역학은 차가 빠르게 달리고, 코너를 안정적으로 통과하며, 경쟁 차와의 격차를 줄이는 데 핵심 역할을 한다. \n공기역학의 목적은 공기 흐름을 설계된 경로로 유도해 지면으로 더 많은 다운포스를 생성하고 항력을 최소화하는 것이다. 이를 위해 프런트윙, 그라운드 이펙트, 리어윙, 사이드팟 같은 부품이 서로 연계된 역할을 한다는 점이 중요하다. \n2025 F1 머신의 공기역학 설계는 프런트윙의 초기 공기 정돈 → 바닥을 통한 그라운드 이펙트 생성 → 리어윙의 안정성 확보 → 사이드팟을 통한 효율적 공기 관리로 이어지는 일련의 흐름을 최적화하는 방식이다.\n\n\n 프런트윙은 차량 전방에 설치되는 가장 첫 공력 장치로, 공기와 처음 접촉해 다운포스를 생성하며 동시에 뒤쪽으로 흐르는 공기를 정돈한다. \n복잡한 플랩과 엔드플레이트를 통해 앞바퀴 주변의 난류를 줄이고, 차체 플로어·디퓨저·리어윙 등 다른 에어로 장치가 효율적으로 작동하도록 도와주는 역할도 한다. \n프런트윙의 작은 형상 변화는 전체 공력 성능에 큰 영향을 미칠 수 있다. \n\n\n 그라운드 이펙트는 F1 공기역학의 중심 개념으로, 차체 바닥과 디퓨저를 이용해 차량 아래쪽 공기 흐름을 빠르게 하여 저압 영역을 만들고, 이를 통해 다운포스를 생성한다. \n이 방식은 전통적인 에어포일 윙에 비해 공기 흐름을 크게 왜곡시키지 않고도 많은 접지력을 만들 수 있어, 2022년 이후 도입된 규정 하에서 핵심 설계 철학이 되었다. \n\n\n 리어윙은 차량 뒤쪽에 위치한 날개로, 주요 다운포스를 생성해 고속 주행 중 차량의 후방 안정성과 균형을 확보한다. \n다운포스를 높이면 코너링 성능은 좋아지지만 항력도 증가하기 때문에, FIA는 리어윙과 DRS 설계에 대해 엄격한 규제를 적용해 공정한 경쟁을 유지하고 있다. \n\n\n 사이드팟은 차 측면에 위치한 공기역학/냉각 장치로, 엔진과 라디에이터의 열을 외부로 배출하면서 동시에 공기 흐름을 관리한다. \n사이드팟 형상과 내부 공기통로 설계는 엔진 냉각 효율뿐 아니라 바깥쪽 공기 흐름이 플로어와 리어윙으로 전달되는 방식에 영향을 준다.",
        "tech",
        Map.of()
        ));

        CAR_DB.put("tyre", new Car(
        "타이어",
        "Pirelli 타이어",
        List.of(
                "/images/cars/tyre.jpg",
                "/images/cars/tyre_1.webp",
                "/images/cars/tyre_2.webp",
                "/images/cars/tyre_3.webp",
                "/images/cars/tyre_4.jpg",
                "/images/cars/tyre_5.webp"
        ),
        "포뮬러 1에서 타이어는 단순한 바퀴 고무가 아니라 성능, 전략, 그립, 레이스 결과를 좌우하는 핵심 부품이다. \n2025년 시즌 공식 타이어 공급사는 Pirelli(피렐리)로, 모든 그랑프리에서 동일한 제조사의 타이어만 사용하도록 되어 있다. \nFIA 규정에 따라 슬릭 타이어는 6가지 컴파운드(C1~C6)로 구성되며, 이 중 3개를 각 그랑프리에서 ‘하드·미디엄·소프트’로 지정하여 제공한다. 드라이 타이어 외에도 인터미디어트, 풀 웨트 레인 타이어가 준비돼 비나 젖은 노면 조건에 대응한다. \n\n\n F1 타이어는 일반 도로용 타이어와 달리 극한의 접지력과 성능을 위해 설계된 고성능 타이어다. 그렇기 때문에 F1 타이어는 수백 km만에 마모되고, 온도·트랙 조건에 따라 그립 성능이 크게 달라진다. \n특히 F1은 타이어 온도 관리가 매우 중요하다. 타이어는 작동 온도 범위가 있어 그 범위를 벗어나면 그립이 급격히 떨어지거나 과열로 성능이 저하된다. \n이는 팀과 드라이버가 워밍업 랩, 브레이킹, 코너 진입/탈출까지 타이어 온도를 정밀하게 관리해야 하는 이유다.\n\n\n 2025시즌 슬릭 타이어 컴파운드는 C1부터 C6까지 여섯 가지 등급으로 분류된다. \nC1~C3는 상대적으로 내구성이 높고 워밍업이 더딘 편이라 장거리 주행에 유리하다. 반대로 C4~C6는 그립 수준은 높지만 마모가 빠른 편이며, 특히 C6은 이번 시즌 새로 도입된 가장 부드러운 컴파운드로서 일부 서킷에서 예선이나 짧은 스틴트용으로 선택된다. \n컴파운드 선택은 트랙 특성, 노면 마모도, 기온 조건 등을 기반으로 피렐리가 결정하며, 팀은 이를 바탕으로 레이스 전략을 세운다. \n\n\n F1 레이스에서는 최소 두 가지 다른 드라이 컴파운드를 사용하도록 규정되어 있고 따로 타이어 사용 규정이 있는 서킷도 있어 전략적 선택이 중요하다. \n빠른 소프트로 랩타임을 뽑고 미디엄으로 레이스 중반 페이스를 관리하거나, 하드 로 긴 스틴트를 시도하는 등의 전략이 나뉜다. \n이 결정은 피트 스탑 타이밍, 트랙 특성, 날씨 조건과 결합해 경기 흐름을 크게 바꿀 수 있다. \n\n\n 레인 타이어는 트레드가 있는 구조로 설계돼 있어 물웅덩이나 습한 노면에서 수막 현상을 줄이고 접지력을 확보한다. \n인터미디어트는 300KM/H 기준 초당 35L의 배수기능이 있어 가벼운 비나 부분적으로 젖은 트랙에 쓰이며, 풀 웨트는 초당 85L의 배수 기능으로 폭우처럼 물이 많을 때 사용된다.",
        "tech",
        Map.of()
        ));

        CAR_DB.put("mclaren", new Car(
        "McLaren MCL39",
        "안정적인 다운포스와 타이어 활용 극대화.",
        List.of(
                "/images/cars/MCL39_1.jpg",
                "/images/cars/MCL39_2.jpg",
                "/images/cars/MCL39_3.jpg",
                "/images/cars/MCL39_4.jpg",
                "/images/cars/MCL39_5.jpg",
                "/images/cars/MCL39_6.jpg"
        ),
        "MCL38은 전반적으로 가장 균형 잡힌 머신으로 극단적인 세팅 없이도 대부분의 트랙에서 강력한 성능을 발휘한다. \n중·고속 코너에서의 다운포스 효율과 차체 안정성이 뛰어나며 연속 코너 구간에서 속도 손실이 적고 타이어 관리가 좋아 레이스 후반에도 페이스가 유지된다. \n다만 저온 노면이나 초저속 코너 비중이 큰 서킷에서는 프런트 반응이 둔해질 수 있어, 세팅으로 앞쪽 그립을 끌어올리는 작업이 중요하다.",
        "team",
        Map.of(
                "팀", "McLaren F1 Team",
                "파워 유닛", "Mercedes",
                "강점", "타이어 관리",
                "특징", "안정적 공력 패키지"
        )
        ));

        CAR_DB.put("mercedes", new Car(
        "Mercedes W16",
        "안정성과 균형을 중시",
        List.of(
            "/images/cars/w16_1.avif",
            "/images/cars/w16_2.jpg",
            "/images/cars/w16_3.webp",
            "/images/cars/w16_4.jpg"
        ),
        "W16은 예측 가능성과 세팅 범위가 넓은 차로, 다양한 서킷에서 안정적인 성능을 낸다.\n중속 코너와 트랙션 구간에서 밸런스가 좋아 레이스 전반에 걸쳐 일정한 랩타임을 유지하며, 타이어 열 관리도 우수한 편이기 때문에 드라이버가 한계를 관리하기 쉽다. \n안정성을 우선한 설계 성향 때문에, 공격적인 세팅을 적용하면 잠재력은 드러나지만, 그 경우 타이어 관리가 어려워진다는 점이 있다. ",
        "team",
        Map.of(
                "팀", "Mercedes-AMG Petronas",
                "파워 유닛", "Mercedes",
                "강점", "공력 효율",
                "특징", "넓은 세팅 범위"
        )
        ));

        CAR_DB.put("redbull", new Car(
        "Red Bull RB21",
        "고속 코너에서의 안정성과 공기역학 성능을 극대화",
        List.of(
            "/images/cars/rb21_1.jpg",
            "/images/cars/rb21_2.jpg",
            "/images/cars/rb21_3.jpg",
            "/images/cars/rb21_4.jpg",
            "/images/cars/rb21_5.jpg"
        ),
        "RB21은 여전히 고속 코너에서 강력한 차체 안정성과 공기역학 효율을 자랑하며, 빠른 방향 전환이 필요한 구간에서 경쟁력이 높다. \n고속 섹션에서는 차가 노면에 단단히 붙어 있는 느낌을 주며, 세팅이 맞았을 때는 단일 랩과 레이스 페이스 모두 최상위권에 근접한다. \n그러나 리어 밸런스가 민감해 저속 코너 탈출 시 트랙션 손실이 발생하는 경우가 잦다. \n세팅 윈도우가 비교적 좁아 트랙 특성에 정확히 맞추지 못하면 주말별 성능 기복이 커진다는 점이 약점이다.",
        "team",
        Map.of(
                "팀", "Red Bull Racing",
                "파워 유닛", "Honda RBPT",
                "강점", "고속 그립",
                "특징", "고효율 다운포스"
        )
        ));

        CAR_DB.put("ferrari", new Car(
        "Ferrari SF-25",
        "직선과 가속 구간에서 강한 파워",
        List.of(
                "/images/cars/SF-25_1.jpg",
                "/images/cars/SF-25_2.jpg",
                "/images/cars/SF-25_3.jpg",
                "/images/cars/SF-25_4.jpg"
        ),
        "SF-25는 강력한 파워 유닛과 낮은 항력 특성을 바탕으로 스트레이트와 가속 구간에서 매우 경쟁력 있는 차다. \n저항을 줄인 세팅에서는 몬차형 서킷이나 직선 비중이 높은 트랙에서 특히 위협적이며, 예선 단발 속도도 뛰어나다. \n반면 저속·중속 코너에서의 기계적 그립이 상대적으로 약하고, 타이어 열화 관리가 까다로워 레이스가 길어질수록 페이스가 떨어지는 경향이 있다. \n세팅과 전략의 정밀도가 성적에 큰 영향을 미치며, 안정성보다는 순간적인 속도에 강점이 있는 성향이다.",
        "team",
        Map.of(
                "팀", "Scuderia Ferrari",
                "파워 유닛", "Ferrari",
                "강점", "레이스 페이스",
                "특징", "저항 최소화"
        )
        ));

        CAR_DB.put("williams", new Car(
        "Williams FW47",
        "중·고속 코너에서 안정적인 밸런스를 중시",
        List.of(
            "/images/cars/fw47_1.jpg",
            "/images/cars/fw47_2.jpg",
            "/images/cars/fw47_3.jpg",
            "/images/cars/fw47_4.jpg"
        ),
        "FW-47은 2025 시즌 중위권에서 가장 안정적인 패키지를 가진 팀 중 하나다. \nFW47은 중속 코너에서의 밸런스가 좋고, 방향 전환이 연속되는 구간에서도 차체 거동이 예측 가능해 드라이버가 자신 있게 몰 수 있다. \n세팅 윈도우가 넓어 트랙 변화에 대한 대응력도 우수한 편이다. 다만 안정성 중심의 성향이 강해 스트레이트 최고속과 고다운포스가 필요한 저속 테크니컬 구간에서는 여전히 한계가 드러나며, 상위권 팀과 비교하면 코너 탈출 가속에서 손해를 본다.",
        "team",
        Map.of(
                "팀", "Williams Racing",
                "파워 유닛", "Mercedes",
                "강점", "중고속 코너",
                "특징", "높은 예측성"
        )
        ));

        CAR_DB.put("rb", new Car(
        "RB VCARB 02",
        "공격적인 드라이빙이 가능한 반응성 강조",
        List.of(
            "/images/cars/vcarb02_1.jpg",
            "/images/cars/vcarb02_2.jpg",
            "/images/cars/vcarb02_3.jpg"
        ),
        "VCARB 02는 프런트 반응이 빠르고 차가 가볍게 느껴지는 성향으로, 중·고속 코너에서 공격적인 턴인을 허용한다. \n예선 단발 랩에서는 세팅이 맞을 경우 상위권을 위협할 수 있는 속도를 보여준다. 그러나 레이스로 들어가면 리어 안정성이 떨어져 타이어 열화가 빠르게 진행되는 경우가 많다. \n저속 코너 탈출 시 트랙션 손실도 잦아 레이스 페이스 유지가 어렵다. 세팅이 맞는 주말과 그렇지 않은 주말의 성능 편차가 큰 팀이다.",
        "team",
        Map.of(
                "팀", "RB Formula One Team",
                "파워 유닛", "Honda RBPT",
                "강점", "드라이버 맞춤",
                "특징", "높은 프론트 반응성"
        )
        ));

        CAR_DB.put("astonmartin", new Car(
        "Aston Martin AMR25",
        "고속 안정성과 직진 성능을 중시한 공력중심",
        List.of(
            "/images/cars/amr25_1.jpg",
            "/images/cars/amr25_2.jpg",
            "/images/cars/amr25_3.jpg",
            "/images/cars/amr25_4.jpg",
            "/images/cars/amr25_5.jpg"
        ),
        "AMR25은 공기저항을 줄인 세팅에서 스트레이트와 고속 코너 구간에서는 경쟁력을 보이지만, 저속 코너 비중이 높은 서킷에서는 성능 저하가 두드러진다. \n프런트 그립이 부족해 코너 진입 속도를 올리기 어렵고, 연속 저속 코너에서는 랩타임 손실이 누적된다. \n안정성을 중시한 세팅 성향으로 차가 온순하게 반응하지만, 그만큼 한계 영역에서 공격적인 주행이 어렵다. 레이스 후반 타이어 성능 저하도 약점으로 작용한다.",
        "team",
        Map.of(
                "팀", "Aston Martin Aramco",
                "파워 유닛", "Mercedes",
                "강점", "고속 코너",
                "특징", "차체 안정성"
        )
        ));

        CAR_DB.put("haas", new Car(
        "Haas VF-25",
        "직선 경쟁력을 기반으로 실용적인 성능",
        List.of(
            "/images/cars/vf25_1.jpg",
            "/images/cars/vf25_2.avif",
            "/images/cars/vf25_3.png",
            "/images/cars/vf25_4.avif"
        ),
        "VF-25는 직선 가속과 최고속도에서 비교적 강점을 보이는 차량으로, 파워 트랙에서는 중위권 경쟁이 가능하다. \n항력을 줄인 세팅에서는 추월과 방어 모두에서 나쁘지 않은 모습을 보인다. 그러나 다운포스 효율이 낮아 중·저속 코너가 많은 서킷에서는 코너 진입과 탈출 모두에서 손해가 크다. \n타이어를 보호하기보다는 단기 성능을 노리는 세팅 경향이 있어 레이스 후반 페이스 유지가 어렵고, 주말 전체 성능 안정성도 부족하다.",
        "team",
        Map.of(
                "팀", "Haas F1 Team",
                "파워 유닛", "Ferrari",
                "강점", "밸런스",
                "특징", "강한 직선 가속"
        )
        ));

        CAR_DB.put("sauber", new Car(
        "Kick Sauber C45",
        "안정적인 차 거동을 바탕으로 점진적 성능 개선",
        List.of(
            "/images/cars/c45_1.jpg",
            "/images/cars/c45_2.avif",
            "/images/cars/c45_3.jpg",
            "/images/cars/c45_4.avif"
        ),
        "C45는 시즌 중반 이후 공기역학 업데이트로 중속 코너 안정성이 개선되며 일부 서킷에서 경쟁력을 보였다. \n다운포스를 실은 상태에서는 차의 거동이 비교적 예측 가능해 실수를 줄이기 쉽다. 하지만 기본적인 절대 속도가 낮아 스트레이트와 가속 구간에서 손해가 크고, 공격적인 세팅으로 성능을 끌어올리기도 어렵다. \n세팅 변화에 따른 성능 폭이 제한적이라 트랙 특성에 맞춘 극적인 대응이 힘든 것이 한계다.",
        "team",
        Map.of(
                "팀", "Kick Sauber",
                "파워 유닛", "Ferrari",
                "강점", "균형 잡힌 성능",
                "특징", "안정적 섀시"
        )
        ));

        CAR_DB.put("alpine", new Car(
        "Alpine A525",
        "코너 탈출과 트랙션을 중시한 섀시 중심",
        List.of(
            "/images/cars/a525_1.jpg",
            "/images/cars/a525_2.jpg",
            "/images/cars/a525_3.jpg",
            "/images/cars/a525_4.jpg"
        ),
        "A525는 2025 시즌 전반적으로 가장 어려운 패키지 중 하나로 평가된다. \n저속·중속 코너 모두에서 기계적 그립이 부족해 랩타임 손실이 누적되며, 타이어 워밍과 열 관리도 까다롭다. 공격적인 세팅을 시도하면 순간적인 속도는 나오지만 차의 안정성이 급격히 무너져 실전에서는 사용하기 어렵다. \n보수적인 세팅을 택하면 페이스가 부족해지는 딜레마에 빠져 있으며, 레이스 전반의 일관성이 가장 큰 약점이다.",
        "team",
        Map.of(
                "팀", "Alpine F1 Team",
                "파워 유닛", "Renault",
                "강점", "트랙션",
                "특징", "기계적 그립"
        )
        ));
    }

    // 목록 페이지
    @GetMapping("/cars")
    public String cars(Model model) {

        Map<String, Car> techCars = new LinkedHashMap<>();
        Map<String, Car> teamCars = new LinkedHashMap<>();

        for (Map.Entry<String, Car> e : CAR_DB.entrySet()) {
            String id = e.getKey();

            // 기술 소개 3개
            if (id.equals("engine") || id.equals("aero") || id.equals("tyre")) {
                techCars.put(id, e.getValue());
            } else {
                // 나머지는 팀 차량
                teamCars.put(id, e.getValue());
            }
        }

        model.addAttribute("techCars", techCars);
        model.addAttribute("teamCars", teamCars);

        return "cars";
    }


    // 상세 페이지 (템플릿 1개로 통합)
    @GetMapping("/cars/{id}")
    public String carDetail(@PathVariable String id, Model model) {
        Car car = CAR_DB.get(id);
        if (car == null) return "redirect:/cars";

        model.addAttribute("carId", id);
        model.addAttribute("car", car);
        return "car-detail";
    }

    // 간단 DTO
    public record Car(
        String name,
        String desc,
        List<String> images,
        String longDesc,
        String type, // "tech" or "team"
        Map<String, String> specs    // 🔥 팀별 스펙
    ) {}
}
