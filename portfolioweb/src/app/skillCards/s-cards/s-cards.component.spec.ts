import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SCardsComponent } from './s-cards.component';

describe('SCardsComponent', () => {
  let component: SCardsComponent;
  let fixture: ComponentFixture<SCardsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SCardsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SCardsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
