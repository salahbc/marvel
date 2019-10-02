import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddSuperTeamComponent } from './add-super-team.component';

describe('AddSuperTeamComponent', () => {
  let component: AddSuperTeamComponent;
  let fixture: ComponentFixture<AddSuperTeamComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddSuperTeamComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddSuperTeamComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
